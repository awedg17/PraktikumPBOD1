package ModulB.program;

import ModulB.model.Mahasiswa;
import ModulB.service.MysqlMahasiswaService;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.List;

public class GuiMahasiswa extends javax.swing.JFrame {

    DefaultListModel<String> dlm;
    MysqlMahasiswaService service;

    private javax.swing.JButton jButtonAmbilSemua;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelEdit;
    private javax.swing.JLabel jLabelHapus;
    private javax.swing.JLabel jLabelReset;
    private javax.swing.JList<String> jListMahasiswa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldIdEdit;
    private javax.swing.JTextField jTextFieldNamaEdit;
    private javax.swing.JTextField jTextFieldIdHapus;

    public GuiMahasiswa() {
        initComponents();

        dlm = new DefaultListModel<>();
        jListMahasiswa.setModel(dlm);

        service = new MysqlMahasiswaService();

        tampilkanSemuaData();
    }

    private void tampilkanSemuaData() {
        dlm.clear();

        List<Mahasiswa> listMahasiswa = service.getAll();

        for (Mahasiswa mahasiswa : listMahasiswa) {
            dlm.addElement(mahasiswa.getId() + " - " + mahasiswa.getNama());
        }
    }

    private void tambahData() {
        String nama = jTextFieldNama.getText();

        if (nama.equals("")) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong");
            return;
        }

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama(nama);

        service.add(mahasiswa);

        jTextFieldNama.setText("");
        tampilkanSemuaData();
    }

    private void editData() {
        String idText = jTextFieldIdEdit.getText();
        String nama = jTextFieldNamaEdit.getText();

        if (idText.equals("") || nama.equals("")) {
            JOptionPane.showMessageDialog(this, "ID dan nama harus diisi");
            return;
        }

        int id = Integer.parseInt(idText);

        Mahasiswa mahasiswa = new Mahasiswa(id, nama);
        service.update(mahasiswa);

        jTextFieldIdEdit.setText("");
        jTextFieldNamaEdit.setText("");
        tampilkanSemuaData();
    }

    private void hapusData() {
        String idText = jTextFieldIdHapus.getText();

        if (idText.equals("")) {
            JOptionPane.showMessageDialog(this, "ID harus diisi");
            return;
        }

        int id = Integer.parseInt(idText);

        service.delete(id);

        jTextFieldIdHapus.setText("");
        tampilkanSemuaData();
    }

    private void resetIndex() {
        service.indexReset();
        tampilkanSemuaData();
        jLabelReset.setText("Index di reset ke 0");
    }

    private void isiFieldDariList() {
        String selected = jListMahasiswa.getSelectedValue();

        if (selected == null) {
            return;
        }

        String[] data = selected.split(" - ");

        jTextFieldIdEdit.setText(data[0]);
        jTextFieldNamaEdit.setText(data[1]);
        jTextFieldIdHapus.setText(data[0]);
    }

    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMahasiswa = new javax.swing.JList<>();
        jLabelJudul = new javax.swing.JLabel();
        jButtonAmbilSemua = new javax.swing.JButton();
        jLabelNama = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jButtonTambah = new javax.swing.JButton();
        jLabelEdit = new javax.swing.JLabel();
        jTextFieldIdEdit = new javax.swing.JTextField();
        jTextFieldNamaEdit = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jLabelHapus = new javax.swing.JLabel();
        jTextFieldIdHapus = new javax.swing.JTextField();
        jButtonHapus = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabelReset = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI Mahasiswa");

        jScrollPane1.setViewportView(jListMahasiswa);

        jLabelJudul.setText("Kelola Data Mahasiswa");

        jButtonAmbilSemua.setText("Ambil Semua Data");
        jButtonAmbilSemua.addActionListener(evt -> tampilkanSemuaData());

        jLabelNama.setText("nama:");
        jButtonTambah.setText("Tambahkan");
        jButtonTambah.addActionListener(evt -> tambahData());

        jLabelEdit.setText("Edit data:");
        jTextFieldIdEdit.setText("id");
        jTextFieldNamaEdit.setText("nama");
        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(evt -> editData());

        jLabelHapus.setText("Hapus data:");
        jTextFieldIdHapus.setText("id");
        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(evt -> hapusData());

        jButtonReset.setText("Reset indeks");
        jButtonReset.addActionListener(evt -> resetIndex());

        jLabelReset.setText("Index di reset ke 0");

        jListMahasiswa.addListSelectionListener(evt -> {
            if (!evt.getValueIsAdjusting()) {
                isiFieldDariList();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGap(30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelJudul)
                    .addComponent(jButtonAmbilSemua)
                    .addComponent(jLabelNama)
                    .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTambah)
                    .addComponent(jLabelEdit)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(jTextFieldNamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(jButtonEdit))
                    .addComponent(jLabelHapus)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldIdHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(jButtonHapus))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonReset)
                        .addGap(10)
                        .addComponent(jLabelReset)))
                .addContainerGap(40, Short.MAX_VALUE)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGap(25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelJudul)
                        .addGap(10)
                        .addComponent(jButtonAmbilSemua)
                        .addGap(15)
                        .addComponent(jLabelNama)
                        .addGap(5)
                        .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5)
                        .addComponent(jButtonTambah)
                        .addGap(15)
                        .addComponent(jLabelEdit)
                        .addGap(5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNamaEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdit))
                        .addGap(15)
                        .addComponent(jLabelHapus)
                        .addGap(5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonHapus))
                        .addGap(20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonReset)
                            .addComponent(jLabelReset))))
                .addContainerGap(25, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new GuiMahasiswa().setVisible(true));
    }

    
}