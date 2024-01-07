package Vistax;
import Controller.Conexion;
import Controller.ControlUniversal;
import Utilerias.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
/**
 *
 * @author root4142
 */
public class frmMDI extends javax.swing.JFrame {
    private Conexion coneccion;
    private ControlUniversal control;
    private JInternalFrame[] all;
    private  Image IMG=new ImageIcon(getClass().getResource("/Vistax/Iconos/icon.ico")).getImage();
    
    public frmMDI() {
        initComponents();
        this.setIconImage(IMG);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    public frmMDI(Conexion con) {
        initComponents();
        coneccion=con;
        control=new ControlUniversal(coneccion);
        this.setIconImage(IMG);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new Ecritorio();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cooperativa Agricola.");
        setName("frmMDI"); // NOI18N
        getContentPane().add(Desktop, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Procesos");

        jMenuItem20.setText("Generar Ahorro Automatico Socio");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem20);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Bancos");

        jMenuItem7.setText("Depositos Bancarios");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem9.setText("Cheques Bancarios");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);
        jMenu3.add(jSeparator1);

        jMenuItem1.setText("Mantenimiento Tabla Banco");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Mantenimiento Tabla Moneda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem8.setText("Mantenimiento Tabla Cuenta");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Compras");

        jMenu6.setText("Compras");

        jMenuItem10.setText("Grabar Compra");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem12.setText("Procesar o Anular Compra");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenu2.add(jMenu6);

        jMenuItem14.setText("Pagos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);
        jMenu2.add(jSeparator2);

        jMenuItem5.setText("Mantenimiento Tabla Proveedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Inventario");

        jMenuItem15.setText("Configurar Minimos");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Traslado de Articulos");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);
        jMenu4.add(jSeparator3);

        jMenuItem4.setText("Mantenimiento Tabla Articulo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem11.setText("Mantenimiento Tabla Bodega");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem13.setText("Mantenimiento Tabla Tienda");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Afiliado");

        jMenuItem18.setText("Mantenimiento Tabla Socios");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);
        jMenu5.add(jSeparator4);

        jMenuItem3.setText("Mantenimiento Tabla Puesto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem6.setText("Mantenimiento Tabla Empresa");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem19.setText("Mantenimiento Tabla Cooperativa");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem17.setText("Asignacion de Tienda A Empresa");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Credito");

        jMenuItem21.setText("Anticipo Socio");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem21);

        jMenuItem22.setText("Prestamo Socio");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        jMenuItem24.setText("Recibos Socio");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem24);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Ventas");

        jMenuItem23.setText("Formulario de Facturacion");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem23);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-734)/2, (screenSize.height-524)/2, 734, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmBanco frmbanco = new frmBanco(control);
            Desktop.add(frmbanco, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmbanco);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmBanco")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmBanco frmbanco = new frmBanco(control);
                Desktop.add(frmbanco, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmbanco);
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmMoneda frmmoneda = new frmMoneda(control);
            Desktop.add(frmmoneda, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmmoneda);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmMoneda")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmMoneda frmmoneda = new frmMoneda(control);
                Desktop.add(frmmoneda, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmmoneda);
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmPuesto frmpuesto = new frmPuesto(control);
            Desktop.add(frmpuesto, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmpuesto);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmPuesto")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmPuesto frmpuesto = new frmPuesto(control);
                Desktop.add(frmpuesto, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmpuesto);
            }
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmArticulo frmarticulo = new frmArticulo(control);
            Desktop.add(frmarticulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmarticulo);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmArticulo")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmArticulo frmarticulo = new frmArticulo(control);
                Desktop.add(frmarticulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmarticulo);
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmProveedor frmproveedor = new frmProveedor(control);
            Desktop.add(frmproveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmproveedor);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmProveedor")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmProveedor frmproveedor = new frmProveedor(control);
                Desktop.add(frmproveedor, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmproveedor);
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmEmpresa frmempresa = new frmEmpresa(control);
            Desktop.add(frmempresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmempresa);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmEmpresa")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmEmpresa frmempresa = new frmEmpresa(control);
                Desktop.add(frmempresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmempresa);
            }
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmCuenta frmcuenta = new frmCuenta(control);
            Desktop.add(frmcuenta, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmcuenta);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmCuenta")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmCuenta frmcuenta = new frmCuenta(control);
                Desktop.add(frmcuenta, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmcuenta);
            }
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmDeposito frmdeposito = new frmDeposito(control);
            Desktop.add(frmdeposito, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmdeposito);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmDeposito")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmDeposito frmdeposito = new frmDeposito(control);
                Desktop.add(frmdeposito, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmdeposito);
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmCheque frmcheque = new frmCheque(control);
            Desktop.add(frmcheque, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmcheque);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmCheque")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmCheque frmcheque = new frmCheque(control);
                Desktop.add(frmcheque, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmcheque);
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmCompra frmcompra = new frmCompra(control);
            Desktop.add(frmcompra, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmcompra);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmCompra")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmCompra frmcompra = new frmCompra(control);
                Desktop.add(frmcompra, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmcompra);
            }
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmBodega frmbodega = new frmBodega(control);
            Desktop.add(frmbodega, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmbodega);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmBodega")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmBodega frmbodega = new frmBodega(control);
                Desktop.add(frmbodega, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmbodega);
            }
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmCompraUdp frmcompraudp = new frmCompraUdp(control);
            Desktop.add(frmcompraudp, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmcompraudp);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmCompraUdp")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmCompraUdp frmcompraudp = new frmCompraUdp(control);
                Desktop.add(frmcompraudp, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmcompraudp);
            }
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmTienda frmtienda = new frmTienda(control);
            Desktop.add(frmtienda, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmtienda);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmTienda")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmTienda frmtienda = new frmTienda(control);
                Desktop.add(frmtienda, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmtienda);
            }
        }
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmPago frmpago = new frmPago(control);
            Desktop.add(frmpago, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmpago);
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmPago")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmPago frmpago = new frmPago(control);
                Desktop.add(frmpago, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmpago);
            }
        }
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmArtMinimo frmminimo = new frmArtMinimo(control);
            Desktop.add(frmminimo, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmminimo);
            frmminimo.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmArtMinimo")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmArtMinimo frmminimo = new frmArtMinimo(control);
                Desktop.add(frmminimo, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmminimo);
            }
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmTraslado frmtraslado = new frmTraslado(control);
            Desktop.add(frmtraslado, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmtraslado);
            frmtraslado.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmTraslado")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmTraslado frmtraslado = new frmTraslado(control);
                Desktop.add(frmtraslado, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmtraslado);
            }
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmTiendaEmpresa frmtiendita = new frmTiendaEmpresa(control);
            Desktop.add(frmtiendita, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmtiendita);
            frmtiendita.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmTiendaEmpresa")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmTiendaEmpresa frmtiendita = new frmTiendaEmpresa(control);
                Desktop.add(frmtiendita, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmtiendita);
            }
        }
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmSocio frmsocio = new frmSocio(control);
            Desktop.add(frmsocio, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmsocio);
            frmsocio.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmSocio")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmSocio frmsocio = new frmSocio(control);
                Desktop.add(frmsocio, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmsocio);
            }
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
    all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmCooperativa frmcooperativa = new frmCooperativa(control);
            Desktop.add(frmcooperativa, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmcooperativa);
            frmcooperativa.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmCooperativa")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmCooperativa frmcooperativa = new frmCooperativa(control);
                Desktop.add(frmcooperativa, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmcooperativa);
            }
        }
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmDeduccionAhorro frmdeduccionahorro = new frmDeduccionAhorro(control);
            Desktop.add(frmdeduccionahorro, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmdeduccionahorro);
            frmdeduccionahorro.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmDeduccionAhorro")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmDeduccionAhorro frmdeduccionahorro = new frmDeduccionAhorro(control);
                Desktop.add(frmdeduccionahorro, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmdeduccionahorro);
            }
        }
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmAnticipo frmanticipo = new frmAnticipo(control);
            Desktop.add(frmanticipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmanticipo);
            frmanticipo.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmAnticipo")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmAnticipo frmanticipo = new frmAnticipo(control);
                Desktop.add(frmanticipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmanticipo);
            }
        }
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmPrestamo frmprestamo = new frmPrestamo(control);
            Desktop.add(frmprestamo, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmprestamo);
            frmprestamo.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmPrestamo")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmPrestamo frmprestamo = new frmPrestamo(control);
                Desktop.add(frmprestamo, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmprestamo);
            }
        }
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmFactura frmfactura = new frmFactura(control);
            Desktop.add(frmfactura, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmfactura);
            frmfactura.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmFactura")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmFactura frmfactura = new frmFactura(control);
                Desktop.add(frmfactura, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmfactura);
            }
        }
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        all = Desktop.getAllFrames();
        if (all.length == 0) {
            frmRecibo frmrecibo = new frmRecibo(control);
            Desktop.add(frmrecibo, javax.swing.JLayeredPane.DEFAULT_LAYER);
            Desktop.setSelectedFrame(frmrecibo);
            frmrecibo.toFront();
        }
        else {
            int t=0;
            for (JInternalFrame x : all) {
                if (x.getName().equals("frmRecibo")) {
                    Desktop.setSelectedFrame(x);
                    t=-1;
                    x.toFront();
                }
            }
            if(t!=-1) {
                frmRecibo frmrecibo = new frmRecibo(control);
                Desktop.add(frmrecibo, javax.swing.JLayeredPane.DEFAULT_LAYER);
                Desktop.setSelectedFrame(frmrecibo);
            }
        }
    }//GEN-LAST:event_jMenuItem24ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMDI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
