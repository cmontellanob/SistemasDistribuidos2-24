using System.Net.Http;
using System.Security.Policy;
using System.Text;
namespace ConsumirServicioRest
{
    
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private async void button1_Click(object sender, EventArgs e)
        {
            HttpClient cliente = new HttpClient();

             

                try
                {
                switch (cbMetodo.SelectedIndex)
                {
                    case 0:
                        HttpResponseMessage response = await cliente.deGetAsync(txtUrl.Text);
                        response.EnsureSuccessStatusCode(); // Lanza una excepción si no se recibe un código de éxito (200-299)
                        string responseData = await response.Content.ReadAsStringAsync(); // Lee el contenido como cadena
                        txtResultado.Text = responseData;

                        break;
                    case 1:
                        StringContent content = new StringContent(txtContenido.Text, Encoding.UTF8, "application/json");
                        
                        HttpResponseMessage response2 = await cliente.PostAsync(txtUrl.Text, content);
                        response2.EnsureSuccessStatusCode(); // Lanza una excepción si no se recibe un código de éxito (200-299)
                        string response2Data = await response2.Content.ReadAsStringAsync(); // Lee el contenido como cadena
                        txtResultado.Text = response2Data;
                        break;


                }




            }
                catch (HttpRequestException ex)
                {
                    
                    txtResultado.Text= "Error de solicitud: " + ex.Message;
                }
            

        }
    }
}
