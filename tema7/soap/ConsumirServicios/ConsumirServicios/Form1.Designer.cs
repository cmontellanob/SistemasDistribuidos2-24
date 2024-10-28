namespace ConsumirServicios
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            label1 = new Label();
            label2 = new Label();
            button1 = new Button();
            cbOperacion = new ComboBox();
            label3 = new Label();
            txtA = new TextBox();
            txtB = new TextBox();
            panel1 = new Panel();
            lblResultado = new Label();
            panel1.SuspendLayout();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(83, 33);
            label1.Name = "label1";
            label1.Size = new Size(15, 15);
            label1.TabIndex = 0;
            label1.Text = "A";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(77, 77);
            label2.Name = "label2";
            label2.Size = new Size(14, 15);
            label2.TabIndex = 1;
            label2.Text = "B";
            // 
            // button1
            // 
            button1.Location = new Point(237, 224);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 2;
            button1.Text = "Calcular";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // cbOperacion
            // 
            cbOperacion.FormattingEnabled = true;
            cbOperacion.Items.AddRange(new object[] { "Suma", "Resta", "Multiplicacion", "Division" });
            cbOperacion.Location = new Point(222, 103);
            cbOperacion.Name = "cbOperacion";
            cbOperacion.Size = new Size(121, 23);
            cbOperacion.TabIndex = 3;
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Location = new Point(73, 111);
            label3.Name = "label3";
            label3.Size = new Size(121, 15);
            label3.TabIndex = 4;
            label3.Text = "Seleccione Operacion";
            // 
            // txtA
            // 
            txtA.Location = new Point(222, 30);
            txtA.Name = "txtA";
            txtA.Size = new Size(100, 23);
            txtA.TabIndex = 5;
            // 
            // txtB
            // 
            txtB.Location = new Point(222, 69);
            txtB.Name = "txtB";
            txtB.Size = new Size(100, 23);
            txtB.TabIndex = 6;
            // 
            // panel1
            // 
            panel1.Controls.Add(lblResultado);
            panel1.Location = new Point(163, 136);
            panel1.Name = "panel1";
            panel1.Size = new Size(235, 68);
            panel1.TabIndex = 7;
            // 
            // lblResultado
            // 
            lblResultado.AutoSize = true;
            lblResultado.Location = new Point(48, 26);
            lblResultado.Name = "lblResultado";
            lblResultado.Size = new Size(15, 15);
            lblResultado.TabIndex = 0;
            lblResultado.Text = "()";
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(971, 309);
            Controls.Add(panel1);
            Controls.Add(txtB);
            Controls.Add(txtA);
            Controls.Add(label3);
            Controls.Add(cbOperacion);
            Controls.Add(button1);
            Controls.Add(label2);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            panel1.ResumeLayout(false);
            panel1.PerformLayout();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private Label label2;
        private Button button1;
        private ComboBox cbOperacion;
        private Label label3;
        private TextBox txtA;
        private TextBox txtB;
        private Panel panel1;
        private Label lblResultado;
    }
}
