package InterfacesAndAbstraction.Lab.CarShop;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRE = 4;

    String getModel();
    String getColor();
    int getHorsePower();
    String countryProduced();
}
