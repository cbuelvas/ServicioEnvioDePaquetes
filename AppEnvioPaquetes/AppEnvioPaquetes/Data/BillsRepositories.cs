using AppEnvioPaquetes.Bills;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace AppEnvioPaquetes.Data
{
    public class BillsRepositories
    {
        static List<Bill> bills = new List<Bill>();

        /*Bill fac1 = new Bill(1,c,p); */

        public void addBill(Bill b)
        {
            bills.Add(b);
        }

        public IEnumerable<Bill> getBills()
        {
            return bills;
        }
    }
}