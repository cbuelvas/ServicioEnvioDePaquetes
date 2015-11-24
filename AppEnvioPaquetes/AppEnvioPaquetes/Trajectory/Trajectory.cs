using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace AppEnvioPaquetes.Trayectory
{
    public class Trajectory
    {
        public double costo;

        public double calculateValue(int op)
        {
            double valor = 0.0;
            switch (op)
            {
                case 1:
                    {
                        valor = 3500;
                        break;
                    }
                case 2:
                    {
                        valor = 5000;
                        break;
                    }
                case 3:
                    {
                        valor = 7500;
                        break;
                    }
                case 4:
                    {
                        valor = 7200;
                        break;
                    }
                case 5:
                    {
                        valor = 12000;
                        break;
                    }
                case 6:
                    {
                        valor = 13500;
                        break;
                    }
                case 7:
                    {
                        valor = 11350;
                        break;
                    }

            }
            return valor;
        }
    }

    
}