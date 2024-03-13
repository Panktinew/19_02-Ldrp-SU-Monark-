package inheritance_example;

public class City extends State {
private String cityName;

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}

@Override
public String toString() {
	return "City [cityName=" + cityName + "]"   +  getSname()   + getCname();
}

}
