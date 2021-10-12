package application;

import static application.DisplayPane.showIntInput;
import static application.DisplayPane.showMessage;

public class ClientVip extends Client {


	final double LIMIT_PROVISIONAL = 1500;
	public double creditLimitVip = LIMIT_PROVISIONAL;

	public ClientVip() {
	}

	public ClientVip(double creditLimitVip, String name, String email, String address, float salary, double document) {
		super(name, email, address, salary, document);
		this.creditLimitVip = creditLimitVip;
	}

	public void chooseLimit(float salary) {
		
		double tryLimit = showIntInput("Defina um limite para este cliente");
		if (salary > 5000) {
			if (tryLimit <= LIMIT_PROVISIONAL) {
				creditLimitVip = LIMIT_PROVISIONAL;
			} else {
				creditLimitVip = tryLimit;
			}
			showMessage("Limite aprovado: R$ " + creditLimitVip + "0");
		} else {
			showMessage("Limite incompatível com a renda do cliente, limite liberado R$ " + LIMIT_PROVISIONAL + "0");
		}
	}

}
