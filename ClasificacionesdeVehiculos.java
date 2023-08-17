public class ClasificacionesdeVehiculos implements VehiculosAereos, VehiculosMaritimos, VehiculosTerrestres{

    @Override
    public String avioneta() {
        return "es un vehiculo aereo y es para uso personal";
    }

    @Override
    public String avion() {
        return "es un vehiculo aereo y es para uso comercial";
    }

    @Override
    public String helicoptero() {
        return "es un vehiculo aereo y es para uso de exploracion";
    }

    @Override
    public String lancha() {
        return "es un vehiculo maritimo y es para uso turistico y comercial";
    }

    @Override
    public String barco() {
        return "es un vehiculo maritimo y es para uso comercial";
    }

    @Override
    public String yate() {
        return "es un vehiculo maritimo y es para uso personal turistico";
    }

    @Override
    public String carro() {
        return "es un vehiculo terrestre y es para uso personal";
    }

    @Override
    public String motocicleta() {
        return "es un vehiculo terrestre y es de uso personal solo que mas ahorrativo que el carro";
    }

    @Override
    public String camion() {
        return "es un vehiculo terrestre y es para uso comercial y de carga";
    }
}
