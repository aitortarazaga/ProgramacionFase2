
package Vistas;

import java.util.Calendar;
import java.util.Locale;
import EjercicioFase2.*;
import Clases.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cambio extends javax.swing.JFrame {

    private static String opc = "";
    
    public Cambio() {
        initComponents();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFnombre = new javax.swing.JTextField();
        TFapellidoUno = new javax.swing.JTextField();
        TFdni = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TFcalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFportal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFpiso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TFmano = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFmovil = new javax.swing.JFormattedTextField();
        TFtelPers = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TFsalario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Bsalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        RBadministracion = new javax.swing.JRadioButton();
        RBlogistica = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        TFapellidoDos = new javax.swing.JTextField();
        Bguardar = new javax.swing.JButton();
        DCfecha = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Perfil");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("PRIMER APELLIDO");

        TFnombre.setEnabled(false);
        TFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreActionPerformed(evt);
            }
        });

        TFapellidoUno.setEnabled(false);
        TFapellidoUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFapellidoUnoActionPerformed(evt);
            }
        });

        try {
            TFdni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdniActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Calle:");

        TFcalle.setEnabled(false);
        TFcalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcalleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Portal:");

        TFportal.setEnabled(false);
        TFportal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFportalActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Piso:");

        TFpiso.setEnabled(false);
        TFpiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpisoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Mano:");

        TFmano.setEnabled(false);
        TFmano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFmanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(TFcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFportal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFmano)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFportal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TFpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TFmano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefonos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Personal:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Movil:");

        try {
            TFmovil.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TFmovil.setEnabled(false);
        TFmovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFmovilActionPerformed(evt);
            }
        });

        TFtelPers.setEnabled(false);
        TFtelPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtelPersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFmovil, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(TFtelPers))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TFtelPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TFmovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Salario:");

        TFsalario.setEnabled(false);
        TFsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsalarioActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha de nacimiento:");

        Bsalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TIPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(RBadministracion);
        RBadministracion.setText("ADMINISTRACION");
        RBadministracion.setEnabled(false);
        RBadministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBadministracionActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBlogistica);
        RBlogistica.setText("LOGISTICA");
        RBlogistica.setEnabled(false);
        RBlogistica.setFocusPainted(false);
        RBlogistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBlogisticaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RBlogistica)
                    .addComponent(RBadministracion))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(RBadministracion)
                .addGap(44, 44, 44)
                .addComponent(RBlogistica)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("SEGUNDO APELLIDO");

        TFapellidoDos.setEnabled(false);
        TFapellidoDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFapellidoDosActionPerformed(evt);
            }
        });

        Bguardar.setText("Guardar");
        Bguardar.setEnabled(false);
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        try {
            DCfecha.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        DCfecha.setEnabled(false);
        DCfecha.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                DCfechaOnSelectionChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel14))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TFnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                        .addComponent(TFapellidoUno)
                                        .addComponent(TFapellidoDos))
                                    .addGap(34, 34, 34)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(Bguardar)
                                .addGap(159, 159, 159)
                                .addComponent(Bsalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(TFsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TFapellidoUno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 21, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(TFapellidoDos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TFsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(DCfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bsalir)
                    .addComponent(Bguardar))
                .addGap(193, 193, 193))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
        GenericoBD.abrirConexion();
        
        if(PersonaBD.comprobarDni(TFdni.getText()) == null){
            ejerciciofase2.EjercicioFase2.mostrarNuevo();
            if(ejerciciofase2.EjercicioFase2.crearNuevo() == true){
                TFdni.setEnabled(false);
                TFnombre.setEnabled(true);
            }
            else
            TFdni.setText("");
        }
        else{
            TFdni.setEnabled(false);
            TFdni.setText(PersonaBD.comprobarDni(TFdni.getText()).getDni());
            TFnombre.setText(PersonaBD.comprobarDni(TFdni.getText()).getNombre());
            TFapellidoUno.setText(PersonaBD.comprobarDni(TFdni.getText()).getApellido1());
            TFapellidoDos.setText(PersonaBD.comprobarDni(TFdni.getText()).getApellido2());
            TFcalle.setText(PersonaBD.comprobarDni(TFdni.getText()).getCalle());
            TFportal.setText(PersonaBD.comprobarDni(TFdni.getText()).getPortal());
            String p = Integer.toString(PersonaBD.comprobarDni(TFdni.getText()).getPiso());
            TFpiso.setText(p);
            TFmano.setText(PersonaBD.comprobarDni(TFdni.getText()).getMano());
            TFtelPers.setText(PersonaBD.comprobarDni(TFdni.getText()).getTelPers());
            TFmovil.setText(PersonaBD.comprobarDni(TFdni.getText()).getTelMovil());
            System.out.println(PersonaBD.comprobarDni(TFdni.getText()).getFecha_nac());
            
            
            /*
            Calendar fecha = null;
                java.util.Date fechasql = PersonaBD.comprobarDni(TFdni.getText()).getFecha_nac();
                if(fechasql != null){
                    fecha = new GregorianCalendar();
                    fecha.setTime(fechasql);
                }
            DCfecha.setSelectedDate(fecha);
            */
            /*Date date = PersonaBD.comprobarDni(TFdni.getText()).getFecha_nac();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = sdf.format(date);
            
            Date date1;
            try {
                date1 = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
                Calendar cal = Calendar.getInstance();
                cal.setTime(date1);
                DCfecha.setSelectedDate(cal);
            } catch (ParseException ex) {
                Logger.getLogger(Cambio.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            //DCfecha.setDate(PersonaBD.comprobarDni(TFdni.getText()).getFecha_nac());
            
            String s;
            if(PersonaBD.comprobarDni(TFdni.getText()).getSalario() == 0)
                s = "";
            else
                s = Float.toString(PersonaBD.comprobarDni(TFdni.getText()).getSalario());
            TFsalario.setText(s);
            if(PersonaBD.cargo().compareToIgnoreCase("administracion") == 0)
                RBadministracion.setSelected(true);
            else
                if(PersonaBD.cargo().compareToIgnoreCase("logistica") == 0)
                    RBlogistica.setSelected(true);
            RBadministracion.setEnabled(false);
            RBlogistica.setEnabled(false);
            ejerciciofase2.EjercicioFase2.guardarDni(TFdni.getText());
            ejerciciofase2.EjercicioFase2.mostrarOpcion();
            if(ejerciciofase2.EjercicioFase2.o() == true){
                TFnombre.setEnabled(true);
                TFnombre.requestFocus();
            }
        }
            
        GenericoBD.cerrarConexion();
    }//GEN-LAST:event_TFdniActionPerformed

    private void TFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreActionPerformed
        if(TFnombre.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFnombre.setEnabled(false);
            TFapellidoUno.requestFocus();
            TFapellidoUno.setEnabled(true);
        }
    }//GEN-LAST:event_TFnombreActionPerformed

    private void TFapellidoUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFapellidoUnoActionPerformed
        if(TFapellidoUno.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFapellidoUno.setEnabled(false);
            TFapellidoDos.requestFocus();
            TFapellidoDos.setEnabled(true);
        }
    }//GEN-LAST:event_TFapellidoUnoActionPerformed

    private void TFapellidoDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFapellidoDosActionPerformed
        if(TFapellidoDos.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFapellidoDos.setEnabled(false);
            TFcalle.requestFocus();
            TFcalle.setEnabled(true);
        }
    }//GEN-LAST:event_TFapellidoDosActionPerformed

    private void TFsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsalarioActionPerformed
        
        TFsalario.setEnabled(false);
        DCfecha.setEnabled(true);
    }//GEN-LAST:event_TFsalarioActionPerformed

    private void DCfechaOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_DCfechaOnSelectionChange
        
        DCfecha.setEnabled(false);
        RBadministracion.setEnabled(true);
        RBlogistica.setEnabled(true);
    }//GEN-LAST:event_DCfechaOnSelectionChange

    private void TFcalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcalleActionPerformed
        if(TFcalle.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFcalle.setEnabled(false);
            TFportal.requestFocus();
            TFportal.setEnabled(true);
        }
    }//GEN-LAST:event_TFcalleActionPerformed

    private void TFportalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFportalActionPerformed
        if(TFportal.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFportal.setEnabled(false);
            TFpiso.requestFocus();
            TFpiso.setEnabled(true);
        }
    }//GEN-LAST:event_TFportalActionPerformed

    private void TFpisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpisoActionPerformed
        if(TFpiso.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFpiso.setEnabled(false);
            TFmano.requestFocus();
            TFmano.setEnabled(true);
        }
    }//GEN-LAST:event_TFpisoActionPerformed

    private void TFmanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFmanoActionPerformed
        if(TFmano.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFmano.setEnabled(false);
            TFtelPers.requestFocus();
            TFtelPers.setEnabled(true);
        }
    }//GEN-LAST:event_TFmanoActionPerformed

    private void TFmovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFmovilActionPerformed
        if(TFmovil.getText().isEmpty())
            javax.swing.JOptionPane.showMessageDialog(null, "El campo no puede estar vacio");
        else{
            TFmovil.setEnabled(false);
            TFsalario.requestFocus();
            TFsalario.setEnabled(true);
        }
    }//GEN-LAST:event_TFmovilActionPerformed

    private void RBadministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBadministracionActionPerformed
        opc = "administracion";
        if(RBadministracion.isSelected() || RBlogistica.isSelected()){
            RBadministracion.setEnabled(false);
            RBlogistica.setEnabled(false);
            Bguardar.setEnabled(true);
        }
    }//GEN-LAST:event_RBadministracionActionPerformed

    private void TFtelPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtelPersActionPerformed
        
        TFtelPers.setEnabled(false);
        TFmovil.setEnabled(true);
        TFmovil.requestFocus();
    }//GEN-LAST:event_TFtelPersActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        if(RBadministracion.isSelected())
            opc = "administracion";
        else
            if(RBlogistica.isSelected())
                opc = "logistica";

        GenericoBD.abrirConexion();
        if(ejerciciofase2.EjercicioFase2.o() == false)
            PersonaBD.guardarPersona(TFdni.getText(), TFnombre.getText(), TFapellidoUno.getText(), TFapellidoDos.getText(), TFcalle.getText(), TFportal.getText(), TFpiso.getText(), TFmano.getText(), TFtelPers.getText(), TFmovil.getText(), TFsalario.getText(), DCfecha.getSelectedDate(), opc);
        else
            if(ejerciciofase2.EjercicioFase2.o() == true)
                PersonaBD.editarPersona(TFdni.getText(), TFnombre.getText(), TFapellidoUno.getText(), TFapellidoDos.getText(), TFcalle.getText(), TFportal.getText(), TFpiso.getText(), TFmano.getText(), TFtelPers.getText(), TFmovil.getText(), TFsalario.getText(), DCfecha.getSelectedDate(), opc);
        ejerciciofase2.EjercicioFase2.reiniciarCambio();
        GenericoBD.cerrarConexion();
    }//GEN-LAST:event_BguardarActionPerformed

    private void RBlogisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBlogisticaActionPerformed
        opc = "logistica";
        if(RBadministracion.isSelected() || RBlogistica.isSelected()){
            RBadministracion.setEnabled(false);
            RBlogistica.setEnabled(false);
            Bguardar.setEnabled(true);
        }
    }//GEN-LAST:event_RBlogisticaActionPerformed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        ejerciciofase2.EjercicioFase2.cerrarCambio();
    }//GEN-LAST:event_BsalirActionPerformed
    
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
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Bsalir;
    private datechooser.beans.DateChooserCombo DCfecha;
    private javax.swing.JRadioButton RBadministracion;
    private javax.swing.JRadioButton RBlogistica;
    private javax.swing.JTextField TFapellidoDos;
    private javax.swing.JTextField TFapellidoUno;
    private javax.swing.JTextField TFcalle;
    private javax.swing.JFormattedTextField TFdni;
    private javax.swing.JTextField TFmano;
    private javax.swing.JFormattedTextField TFmovil;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JTextField TFpiso;
    private javax.swing.JTextField TFportal;
    private javax.swing.JTextField TFsalario;
    private javax.swing.JTextField TFtelPers;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
