using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using System.Web.UI.WebControls.WebParts;

namespace Servicios
{
    /// <summary>
    /// Descripción breve de Segip
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class Segip : System.Web.Services.WebService
    {

        [WebMethod]
        public Persona Buscar(String ci) {
            Persona aux = new Persona("12345", "Juan", "Perez", "Perez");
            
            return aux;
        }
    }

    public class Persona
    {
        public String ci;
        public String nombres;
        public String pimerApellido;
        public String segundoApellido;
        public Persona()
        {

        }
        public Persona(String ci, String nombres, String primerApellido, String segundoApellido)
        {
            this.ci = ci;
            this.nombres = nombres;
            this.pimerApellido = primerApellido;
            this.segundoApellido = segundoApellido;

        }
        
    }
}
