/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeeapp.view;

import employeeapp.model.DBConnection;
import employeeapp.model.Payroll;
import employeeapp.model.PayrollD;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khanyisile
 */
public class ManagePayJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ManagePayJFrame
     */
    public ManagePayJFrame() {
        initComponents();
    }
    DBConnection db = new DBConnection();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPayrolls = new javax.swing.JTable();
        btnPayView = new javax.swing.JButton();
        tfEmpID = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnPayViewBAck = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taPayslip = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnPaySlip = new javax.swing.JButton();
        tfEmpIdPS = new javax.swing.JTextField();
        btnPaySlipBack = new javax.swing.JButton();
        jpanel = new javax.swing.JPanel();
        btnAddPay = new javax.swing.JButton();
        tfEmpIDAbb = new javax.swing.JTextField();
        tfPayDate = new javax.swing.JTextField();
        tfPRid = new javax.swing.JTextField();
        tfSalary = new javax.swing.JTextField();
        tfDes = new javax.swing.JTextField();
        btnDeletePay = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        passfAdmin = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        btnAddPayBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPayrolls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pay Roll ID", "Employee ID", "Salary", "Pay Date", "Description"
            }
        ));
        jScrollPane2.setViewportView(tblPayrolls);

        btnPayView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPayView.setText("View Payrolls");
        btnPayView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayViewActionPerformed(evt);
            }
        });

        tfEmpID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Enter Employee ID");

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearch.setText("Seach");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnPayViewBAck.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPayViewBAck.setText("Back");
        btnPayViewBAck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayViewBAckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPayView)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPayViewBAck)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnPayView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnPayViewBAck)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Payrolls", jPanel1);

        taPayslip.setEditable(false);
        taPayslip.setColumns(20);
        taPayslip.setRows(5);
        jScrollPane1.setViewportView(taPayslip);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Employee ID");

        btnPaySlip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPaySlip.setText("Generate Payslip");
        btnPaySlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaySlipActionPerformed(evt);
            }
        });

        tfEmpIdPS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnPaySlipBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPaySlipBack.setText("Back");
        btnPaySlipBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaySlipBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfEmpIdPS, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnPaySlip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPaySlipBack)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmpIdPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPaySlipBack)
                    .addComponent(btnPaySlip))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Payslip", jPanel2);

        btnAddPay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddPay.setText("Add payment");
        btnAddPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPayActionPerformed(evt);
            }
        });

        tfEmpIDAbb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfPayDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfPRid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfDes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnDeletePay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletePay.setText("Delete Payment");
        btnDeletePay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePayActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Enter Payroll ID");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Enter Admin Password");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Enter Pay date");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Enter Employee ID");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Enter Salary");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Enter Description");

        passfAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Enter Payroll ID to Delete");

        btnAddPayBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddPayBack.setText("Back");
        btnAddPayBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPayBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddPayBack)
                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jpanelLayout.createSequentialGroup()
                                .addComponent(passfAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelLayout.createSequentialGroup()
                                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22)
                                    .addComponent(tfPRid, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpanelLayout.createSequentialGroup()
                                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel25)
                                            .addComponent(tfEmpIDAbb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(tfSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(tfDes)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelLayout.createSequentialGroup()
                                .addComponent(btnAddPay)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeletePay)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPRid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmpIDAbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPayDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passfAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPay)
                    .addComponent(btnDeletePay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnAddPayBack)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("Add Payroll", jpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Display all payments
    private void btnPayViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayViewActionPerformed
        // TODO add your handling code here:
        try {
            db.connect();
            Connection conn = db.getConnection();
            
            if(conn == null){
                JOptionPane.showMessageDialog(this, "Database connection not established.", "Error", JOptionPane.ERROR_MESSAGE);
                return;     
            }
            
            try {
                PayrollD payrollD = new PayrollD(conn);
                java.util.List<employeeapp.model.Payroll> payrolls = payrollD.getAllPayrolls();
                
                DefaultTableModel tbmodel = (DefaultTableModel) tblPayrolls.getModel();
                tbmodel.setRowCount(0);
                
                for(employeeapp.model.Payroll pr : payrolls){
                    tbmodel.addRow(new Object[]{
                        pr.getPayrollID(),
                        pr.getEmployeeID(),
                        pr.getPayDate(),
                        pr.getSalary(),
                        pr.getDescrip()
                    });
                }
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error fetching Payrolls: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(ManageEmpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPayViewActionPerformed

    //Search for specific pay ment id
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try {
            if (tfEmpID.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in the Employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int EmployeeID = Integer.parseInt(tfEmpID.getText().trim());
            
            db.connect();
            Connection conn = db.getConnection();
            
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Database connection not established.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            try {
                PayrollD pd = new PayrollD(conn);
                java.util.List<employeeapp.model.Payroll> payrolls = pd.getPayrollsByEmployeeID(EmployeeID);
                
                DefaultTableModel tbmodel = (DefaultTableModel) tblPayrolls.getModel();
                tbmodel.setRowCount(0);

                if (payrolls == null) {
                    JOptionPane.showMessageDialog(this, "Employee ID not found.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                
                for(employeeapp.model.Payroll pr : payrolls){
                    tbmodel.addRow(new Object[]{
                        pr.getPayrollID(),
                        pr.getEmployeeID(),
                        pr.getPayDate(),
                        pr.getSalary(),
                        pr.getDescrip()
                    });
                }
            } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error fetching Payrolls: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);

            }
        } 
        catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Employee ID. Please enter a valid number.", "Input Error", 
                JOptionPane.ERROR_MESSAGE);
            }        
        catch (ClassNotFoundException | SQLException e) 
        {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    //Deleter specific payments
    private void btnDeletePayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePayActionPerformed
        // TODO add your handling code here:
        String password = new String(passfAdmin.getPassword()).trim();

        if (password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (!password.equals("Admin123")) {
            JOptionPane.showMessageDialog(this, "Please enter correct Admin Password","Invalid Password", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        JOptionPane.showMessageDialog(this, "Password is valid!", "Success", JOptionPane.INFORMATION_MESSAGE);

        try{
            if(tfPRid.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please fill in the Payroll ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }

            int EmployeeID = Integer.parseInt(tfPRid.getText().trim());

            db.connect();
            Connection conn = db.getConnection();

            if (conn == null) {
            JOptionPane.showMessageDialog(this, "Database connection not established.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }

            PayrollD pd = new PayrollD(conn);
            pd.deletePayroll(EmployeeID);
        }
        catch (IllegalArgumentException e) {
        } 
        //multi catch
        catch (ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(ManageEmpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletePayActionPerformed

    //Add a payment action
    private void btnAddPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPayActionPerformed
        // TODO add your handling code here:
        String password = new String(passfAdmin.getPassword()).trim();

        if (password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if (!password.equals("Admin123")) {
            JOptionPane.showMessageDialog(this, "Please enter correct Admin Password","Invalid Password", JOptionPane.ERROR_MESSAGE);
            return;
        } 
        JOptionPane.showMessageDialog(this, "Password is valid!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        try {
            if(tfEmpIDAbb.getText().trim().isEmpty() || tfDes.getText().trim().isEmpty() || tfPRid.getText().trim().isEmpty() ||
                    tfPayDate.getText().trim().isEmpty() || tfSalary.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //pay date builder
            LocalDate currentDate = LocalDate.now();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateWith25thDay = currentDate.withDayOfMonth(25).toString();
            Date payDate = sdf.parse(dateWith25thDay);
            java.sql.Date sqlDate = new java.sql.Date(payDate.getTime());
            
            //Description builder
            Month currentMonth = currentDate.getMonth();
            String sDescrip = tfDes.getText().trim() + " " +  "(" + currentMonth.toString()+ ")";
            
            int iEmployeeID = Integer.parseInt(tfEmpIDAbb.getText().trim());
            int iPayID = Integer.parseInt(tfPRid.getText().trim());
            
            double dSalary = 0;
            try {
                dSalary = Double.parseDouble(tfSalary.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid salary. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            db.connect();
            Connection conn = db.getConnection();
            
            if (conn == null) {
            JOptionPane.showMessageDialog(this, "Database connection not established.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
            
            try {
                PayrollD pd = new PayrollD(conn);
                Payroll payroll = new Payroll(iPayID, iEmployeeID, dSalary, sqlDate, sDescrip);
                pd.addPayroll(payroll);
                JOptionPane.showMessageDialog(this, "Payroll added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (HeadlessException | SQLException e) {
            }
        }
        catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
        } 
        catch (ParseException ex) {
            java.util.logging.Logger.getLogger(ManagePayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddPayActionPerformed

    //Generate payslip
    private void btnPaySlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaySlipActionPerformed
        // TODO add your handling code here:
        try {
            if (tfEmpIdPS.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in the Employee ID.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int EmployeeID = Integer.parseInt(tfEmpIdPS.getText().trim());
            
            db.connect();
            Connection conn = db.getConnection();
            
            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Database connection not established.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            PayrollD pd = new PayrollD(conn);
            String pr = pd.PaySlip(EmployeeID);
                        
            if (pr == null) {
                JOptionPane.showMessageDialog(this, "Employee ID not found.", "Error", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            taPayslip.setText(pr);  // Insert the payslip into the text area
        } 
        catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Employee ID. Please enter a valid number.", "Input Error", 
                JOptionPane.ERROR_MESSAGE);
            }        
        catch (ClassNotFoundException | SQLException e) 
        {
                JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPaySlipActionPerformed

    //Return to management page
    private void btnPayViewBAckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayViewBAckActionPerformed
        // TODO add your handling code here:
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPayViewBAckActionPerformed

    //Return to management page
    private void btnPaySlipBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaySlipBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPaySlipBackActionPerformed

    //Return to management page
    private void btnAddPayBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPayBackActionPerformed
        // TODO add your handling code here:
        MainJFrame mainJFrame = new MainJFrame();
        mainJFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddPayBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagePayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagePayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagePayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagePayJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManagePayJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPay;
    private javax.swing.JButton btnAddPayBack;
    private javax.swing.JButton btnDeletePay;
    private javax.swing.JButton btnPaySlip;
    private javax.swing.JButton btnPaySlipBack;
    private javax.swing.JButton btnPayView;
    private javax.swing.JButton btnPayViewBAck;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpanel;
    private javax.swing.JPasswordField passfAdmin;
    private javax.swing.JTextArea taPayslip;
    private javax.swing.JTable tblPayrolls;
    private javax.swing.JTextField tfDes;
    private javax.swing.JTextField tfEmpID;
    private javax.swing.JTextField tfEmpIDAbb;
    private javax.swing.JTextField tfEmpIdPS;
    private javax.swing.JTextField tfPRid;
    private javax.swing.JTextField tfPayDate;
    private javax.swing.JTextField tfSalary;
    // End of variables declaration//GEN-END:variables
}
