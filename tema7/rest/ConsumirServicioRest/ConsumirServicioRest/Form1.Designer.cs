namespace ConsumirServicioRest
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
            txtUrl = new TextBox();
            cbMetodo = new ComboBox();
            label2 = new Label();
            button1 = new Button();
            txtContenido = new TextBox();
            txtResultado = new TextBox();
            SuspendLayout();
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(54, 28);
            label1.Name = "label1";
            label1.Size = new Size(21, 15);
            label1.TabIndex = 0;
            label1.Text = "url";
            // 
            // txtUrl
            // 
            txtUrl.Location = new Point(121, 20);
            txtUrl.Name = "txtUrl";
            txtUrl.Size = new Size(354, 23);
            txtUrl.TabIndex = 1;
            // 
            // cbMetodo
            // 
            cbMetodo.FormattingEnabled = true;
            cbMetodo.Items.AddRange(new object[] { "GET", "POST", "PUT", "DETELE" });
            cbMetodo.Location = new Point(145, 62);
            cbMetodo.Name = "cbMetodo";
            cbMetodo.Size = new Size(121, 23);
            cbMetodo.TabIndex = 2;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Location = new Point(54, 65);
            label2.Name = "label2";
            label2.Size = new Size(49, 15);
            label2.TabIndex = 3;
            label2.Text = "metodo";
            // 
            // button1
            // 
            button1.Location = new Point(410, 65);
            button1.Name = "button1";
            button1.Size = new Size(75, 23);
            button1.TabIndex = 4;
            button1.Text = "Llamar";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // txtContenido
            // 
            txtContenido.Location = new Point(42, 122);
            txtContenido.Multiline = true;
            txtContenido.Name = "txtContenido";
            txtContenido.Size = new Size(295, 185);
            txtContenido.TabIndex = 5;
            // 
            // txtResultado
            // 
            txtResultado.Location = new Point(493, 133);
            txtResultado.Multiline = true;
            txtResultado.Name = "txtResultado";
            txtResultado.Size = new Size(295, 185);
            txtResultado.TabIndex = 6;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(800, 450);
            Controls.Add(txtResultado);
            Controls.Add(txtContenido);
            Controls.Add(button1);
            Controls.Add(label2);
            Controls.Add(cbMetodo);
            Controls.Add(txtUrl);
            Controls.Add(label1);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Label label1;
        private TextBox txtUrl;
        private ComboBox cbMetodo;
        private Label label2;
        private Button button1;
        private TextBox txtContenido;
        private TextBox txtResultado;
    }
}
