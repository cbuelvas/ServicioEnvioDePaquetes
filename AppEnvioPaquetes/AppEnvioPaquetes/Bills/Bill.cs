using AppEnvioPaquetes.Customers;
using AppEnvioPaquetes.Data;
using AppEnvioPaquetes.PackagesRepo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace AppEnvioPaquetes.Bills
{
    public class Bill
    {
        public int IdBill { get; set; }        
        public string Cliente { get; set; }
        public string Items { get; set; }
        public double ValorFactura;
        public List<Packages> listado;
        public Bill()
        {
            IdBill = 0;
            Cliente = "Datos del cliente";
            Items = "Listado de paquetes";
            ValorFactura = totalCost();
        }

        public Bill(int id, string p)
        {
            IdBill = id;
            Cliente = clientData(id);
            Items = p;
            ValorFactura = totalCost();
        }

        public double totalCost()
        {            
            double suma = 0.0;
            foreach (Packages p in listado)
                suma += p.ValorEnvio;
            return suma;
        }

        public override string ToString()
        {
            return
                "\nId Factura: " + IdBill +
                "\n" + Cliente + 
                "\nITEMS!!"
                ;
                
        }
        public string clientData(int id)
        {
            string result ="";
            foreach(Customer c in CustomersRepositories.clientes)
                if (c.IdCliente == id)
                {
                    result += c.ToString();
                }

            return result;
        }
    }
}