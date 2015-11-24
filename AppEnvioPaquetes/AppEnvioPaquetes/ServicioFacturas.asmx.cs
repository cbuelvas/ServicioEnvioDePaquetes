using AppEnvioPaquetes.Bills;
using AppEnvioPaquetes.Customers;
using AppEnvioPaquetes.Data;
using AppEnvioPaquetes.PackagesRepo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

namespace AppEnvioPaquetes
{
    /// <summary>
    /// Descripción breve de ServicioFacturas
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class ServicioFacturas : System.Web.Services.WebService
    {
        BillsRepositories facturas = new BillsRepositories();

        [WebMethod]
        public void addBill(int Id, string p)
        {
            Bill b = new Bill(Id, p);
            facturas.addBill(b);
        }

        [WebMethod]
        public string showBill()
        {
            string res = "";
            foreach (Bill b in facturas.getBills())
                res += b.ToString();
            return res;
        }
    }
}
