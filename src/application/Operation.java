package application;

import static application.DisplayPane.showInput;
import static application.DisplayPane.showIntInput;
import static application.DisplayPane.showMessage;

import java.util.ArrayList;

public class Operation {

	String name, email, address, document;
	float salary;

	NormalyClient normalyClient = new NormalyClient();
	ClientVip clientVip = new ClientVip();
	public static ArrayList<Client> data = new ArrayList<Client>();

	public void registerClient() {

		name = showInput("Informe o nome completo do cliente");
		email =showInput("Informe o email do cliente");
		address = showInput("Informe o endere�o do cliente");
		document = showInput("Informe o CPF do cliente");
		salary = showIntInput("Informe o Sal�rio do cliente");

		if (salary >= 2500) {
			clientVip.chooseLimit(salary);
			data.add(clientVip);
			clientReport();
		} else if (salary == 0) {
			showMessage("Cliente n�o possui renda fixa declarada, cadastro n�o permitido");
		} else {
			data.add(normalyClient);
			showMessage("Cliente " + name + " cadastrado com limite de R$ " + normalyClient.creditLimit + "0");
			clientReport();
		}

	}

	public void clientReport() {
		double showLimit = 0;

		if (salary >= 2500) {
			showLimit = clientVip.creditLimitVip;
		} else {
			showLimit = normalyClient.creditLimit;
		}
		showMessage("-------------RELAT�RIO DO CADASTRO---------------" + "\n\n" + "Nome do Cliente: "
				+ name + "\n\n" + "E-mail: " + email + "\n\n" + "Endere�o: " + address + "\n\n" + "CPF infomado: "
				+ document + "\n\n" + 
				"Limite de cr�dito liberado: R$ " + showLimit + "0");

	}

}
