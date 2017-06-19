import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

		private CalculatorView theView;
		private CalculatorModel theModel;
		
		public CalculatorController(CalculatorView view ,CalculatorModel theModel)
		{
			this.theModel=theModel;
			this.theView=view;
			
			this.theView.addCalculateListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int first,second=0;
					try
					{
						first=theView.getFirstNumber();
						second=theView.getSecondNumber();
						theModel.addTwoNums(first, second);
						theView.setCalcSolution(theModel.getCalculationVal());
					}catch(NumberFormatException ex)
					{
						theView.displayErrorMessage("u need enter 2 ints.");
					}
				}
			});
		}
		
		
}
