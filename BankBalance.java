import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class BankBalance extends JPanel implements ActionListener {


	static JTextField balanceField, depositField, withdrawField, output;
	
	static JFrame bankBalance;
	
	
	
	static JLabel balance, deposit, withdraw;
	
	double accountBalance = 0.0;

	BankBalance(){
		
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bankBalance = new JFrame("Bank Account Balance");
		
		bankBalance.setLayout(new FlowLayout());
		
		
		balance = new JLabel("Balance:");
		deposit = new JLabel("Deposit:");
		withdraw = new JLabel("Withdraw:");
		
	
		
		
		
		balanceField = new JTextField(16);
		depositField = new JTextField(16);
		withdrawField = new JTextField(16);
		output = new JTextField();
		
		balanceField.setText("0");
		depositField.setText("0");
		withdrawField.setText("0");
		output.setText("0");
		
		JPanel balancePanel = new JPanel();
		JPanel depositPanel = new JPanel();
		JPanel withdrawPanel = new JPanel();
		
		balancePanel.add(balance);
		balancePanel.add(balanceField);
		
		depositPanel.add(deposit);
		depositPanel.add(depositField);
		
		withdrawPanel.add(withdraw);
		withdrawPanel.add(withdrawField);


		balancePanel.setVisible(true);
		depositPanel.setVisible(true);
		withdrawPanel.setVisible(true);
		
		output.setVisible(true);
		
		bankBalance.add(balancePanel);
		bankBalance.add(depositPanel);
		bankBalance.add(withdrawPanel);
		
		JButton calculate = new JButton("Calculate");
		JButton exit = new JButton("Exit");
		
		BankBalance te = new BankBalance();
		
		calculate.addActionListener(te);
		
		calculate.setVisible(true);
		exit.setVisible(true);
		output.setVisible(true);
		
		bankBalance.add(calculate);
		bankBalance.add(exit);
		bankBalance.add(output);
		
		bankBalance.setSize(300, 300);
		
		bankBalance.show();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s = e.getActionCommand();
		if (s.equals("Calculate")) {

		String userBalance = balanceField.getText();
		String userDeposit = depositField.getText();
		String userWithdraw = withdrawField.getText();
		
		double enteredBalance = Double.parseDouble(userBalance);
		double enteredDeposit = Double.parseDouble(userDeposit);
		double enteredWithdraw = Double.parseDouble(userWithdraw);
		
		accountBalance = enteredBalance + enteredDeposit - enteredWithdraw;
		output.setText(String.valueOf(accountBalance));
		System.out.println("Your current account balance:$ " + accountBalance);
		
		}

	}

}
