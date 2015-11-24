using AppEnvioPaquetes.Customers;
using AppEnvioPaquetes.Data;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace AppEnvioPaquetes
{
    /// <summary>
    /// Descripción breve de ServicioClientes
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class ServicioClientes : System.Web.Services.WebService
    {
        CustomersRepositories customers = new CustomersRepositories();

        [WebMethod]
        public void ClientesADD(int IdC, string NombreC, string DirC, string TelC, string EmailC, int tipoC)
        {
            Customer c = new Customer(IdC, NombreC, DirC, TelC, EmailC, tipoC);
            customers.addCustomer(c);
        }
        [WebMethod]
        public string ClientesSHOW()
        {
            string result = "";
            foreach (Customer c in customers.getCustomer())
                result += c.ToString();
            return result;
        }

        [WebMethod]
        public string ClientesSEARCH(int id)
        {
            string result = "El cliente solicitado no existe!";
            foreach (Customer c in customers.getCustomer())
                if (c.IdCliente == id)
                {
                    result = "";
                    result += c.ToString();
                }
            return result;
        }
        [WebMethod]
        public Customer ClientesEDIT(int id)
        {
            Customer cli = new Customer();
            foreach (Customer c in customers.getCustomer())
                if (c.IdCliente == id)
                {
                    cli = c;
                }
            return cli;
        }

        [WebMethod]
        public string ClientesTYPESEARCH(string tipo)
        {
            string result = "";
            foreach (Customer c in customers.getCustomer())
                if (c.TipoCliente == tipo)
                {
                    result += c.ToString();
                }
            return result;
        }
    }
}
