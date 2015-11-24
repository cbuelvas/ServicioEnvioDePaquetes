using AppEnvioPaquetes.Customers;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace AppEnvioPaquetes.Data
{
    public class CustomersRepositories
    {
        public static List<Customer> clientes = new List<Customer>();

        public void addCustomer(Customer c)
        {
            clientes.Add(c);
        }
        public IEnumerable<Customer> getCustomer()
        {
            return clientes;
        }
    }
}