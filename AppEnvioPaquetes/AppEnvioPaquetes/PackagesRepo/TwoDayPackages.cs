using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace AppEnvioPaquetes.PackagesRepo
{
    public class TwoDayPackages : Packages
    {
        public double CuotaEnvio { get; set; }

        public TwoDayPackages() : base()
        {
            CuotaEnvio = 0.0;
            ValorPaquete = calculateCost();
        }
        public TwoDayPackages(int codigo, string direccion, string nombre, string pais,
            string departamento, int codpostrem, int codpostdest, double peso, double costoporgramos, double cuota)
            : base (codigo, direccion, nombre, pais, departamento, codpostrem, codpostdest, peso, costoporgramos)
        {
            CuotaEnvio = cuota;
            ValorPaquete = calculateCost();
        }

        public override string ToString()
        {
            return base.ToString() +
                "\nCuota envio en dos dias: " + CuotaEnvio;
        }
        public override bool Equals(object obj)
        {
            TwoDayPackages t = (TwoDayPackages)obj;
            bool result = false;
            if((base.Equals(t)) && 
                this.CuotaEnvio == t.CuotaEnvio)
            {
                result = true;
            }
            return result;
        }
        public override int GetHashCode()
        {
            return this.ToString().GetHashCode();
        }
        public override double calculateCost()
        {
            double costo;
            costo = CostoPorGramos * (Peso * 1000);
            costo += CuotaEnvio;
            return costo;
        }
    }
}