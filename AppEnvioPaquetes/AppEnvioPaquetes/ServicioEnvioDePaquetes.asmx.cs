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
    /// Descripción breve de ServicioEnvioDePaquetes
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class ServicioEnvioDePaquetes : System.Web.Services.WebService
    {
        PackagesRepositories packages = new PackagesRepositories();        
        BillsRepositories facturas = new BillsRepositories();

        [WebMethod]
        public void addPaquetes(int Codigo,
                               string Nombre,
                               string Direccion,
                               string Pais,
                               string Departamento,
                               int CodPosRemitente,
                               int CodPosDestinatario,
                               double Peso,
                               double CostoPorGramos)
        {
            Packages pkg = new Packages(Codigo,
                                        Nombre,
                                        Direccion,
                                        Pais,
                                        Departamento,
                                        CodPosRemitente,
                                        CodPosDestinatario,
                                        Peso,
                                        CostoPorGramos);

            packages.addPackage(pkg);

        }

        [WebMethod]
        public string showPackages()
        {
            string result = "";
            foreach (Packages i in packages.getPackage())
                result += i.ToString();
            return result;
        }

        [WebMethod]
        public void addTDP(int Codigo,
                               string Nombre,
                               string Direccion,
                               string Pais,
                               string Departamento,
                               int CodPosRemitente,
                               int CodPosDestinatario,
                               double Peso,
                               double CostoPorGramos,
                                double Cuota)
        {
            TwoDayPackages pkg = new TwoDayPackages(Codigo,
                                        Nombre,
                                        Direccion,
                                        Pais,
                                        Departamento,
                                        CodPosRemitente,
                                        CodPosDestinatario,
                                        Peso,
                                        CostoPorGramos,
                                        Cuota);

            packages.addTDP(pkg);

        }

        [WebMethod]
        public string showTDP()
        {
            string result = "";
            foreach (TwoDayPackages i in packages.getTDP())
                result += i.ToString();
            return result;
        }

        [WebMethod]
        public void addNightPackage(int Codigo,
                               string Nombre,
                               string Direccion,
                               string Pais,
                               string Departamento,
                               int CodPosRemitente,
                               int CodPosDestinatario,
                               double Peso,
                               double CostoPorGramos,
                                double Cuota)
        {
            OvernightPackage pkg = new OvernightPackage(Codigo,
                                        Nombre,
                                        Direccion,
                                        Pais,
                                        Departamento,
                                        CodPosRemitente,
                                        CodPosDestinatario,
                                        Peso,
                                        CostoPorGramos,
                                        Cuota);

            packages.addNightPackage(pkg);

        }

        [WebMethod]
        public string showNightPackages()
        {
            string result = "";
            foreach (OvernightPackage i in packages.getNightPackage())
                result += i.ToString();
            return result;
        }

        [WebMethod]
        public string showPkgByID(int id)
        {
            string result = "El paquete  relacionado a este codigo no existe!";
            foreach (OvernightPackage i in packages.getNightPackage())
                if (i.Codigo == id)
                {
                    result = "";
                    result += i.ToString();
                }
            foreach (Packages i in packages.getPackage())
                if(i.Codigo == id)
                {
                    result = "";
                    result += i.ToString();
                }
            foreach (TwoDayPackages i in packages.getTDP())
                if (i.Codigo == id)
                {
                    result = "";
                    result += i.ToString();
                }
            return result;
        }


    }
}
