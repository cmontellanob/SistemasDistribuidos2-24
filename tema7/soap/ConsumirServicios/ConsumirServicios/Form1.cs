namespace ConsumirServicios
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a = int.Parse(txtA.Text);
            int b = int.Parse(txtB.Text);
            int c = 0;
            ServicioOperaciones.OperacionesSoapClient cliente = new ServicioOperaciones.OperacionesSoapClient(ServicioOperaciones.OperacionesSoapClient.EndpointConfiguration.OperacionesSoap);
            switch (cbOperacion.SelectedIndex)
            {
                case 0:
                    c = cliente.Sumar(a, b); break;
                case 1:
                    c = cliente.Restar(a, b); break;
                case 2:
                    c = cliente.Multiplicacion(a, b); break;
                case 3:
                    c = cliente.Division(a, b); break;



            }
            lblResultado.Text = c.ToString();
        }
    }
}
