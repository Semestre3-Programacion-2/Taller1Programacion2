package co.edu.unbosque.model;

public class Cliente {
	private String cedula;
	private double monto;
		public Cliente(String cedula, double monto) {
		this.cedula = cedula;
		this.monto = monto;
	}
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
		public double getMonto() {
			return monto;
		}
		public void setMonto(double monto) {
			this.monto = monto;
		}
	
}
