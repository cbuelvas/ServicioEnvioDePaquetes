using AppEnvioPaquetes.PackagesRepo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace AppEnvioPaquetes.Data
{
    public class PackagesRepositories
    {
        static List<Packages> paquetes = new List<Packages>();
        static List<TwoDayPackages> tdp = new List<TwoDayPackages>();
        static List<OvernightPackage> op = new List<OvernightPackage>();

        Packages pkg1 = new Packages(001, "Almirante", "Carlos", "Colombia","Bolivar", 0123, 0123, 0.8, 50 );
                
        public void addPackage(Packages p)
        {            
            paquetes.Add(p);
        }
        public IEnumerable<Packages> getPackage()
        {
            return paquetes;
        }
        public void addTDP(TwoDayPackages t)
        {
            tdp.Add(t);
        }
        public IEnumerable<TwoDayPackages> getTDP()
        {
            return tdp;
        }
        public void addNightPackage(OvernightPackage o)
        {
            op.Add(o);
        }
        public IEnumerable<OvernightPackage> getNightPackage()
        {
            return op;
        }
    }
}