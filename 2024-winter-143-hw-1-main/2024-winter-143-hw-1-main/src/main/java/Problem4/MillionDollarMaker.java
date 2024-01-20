/*
 * DO NOT MAKE ANY CHANGES UNLESS SPECIFIED OTHERWISE
 */

package Problem4;

public class MillionDollarMaker {
    static final int MONTHS_PER_YEAR = 12;   // what does "static" and "final" do?

    // Do not change signature (function name, parameter variable type, and return type)
    // OK to change parameter variable names. In fact, are the parameter names bad and why?
    public static CompoundingResult calculate(float initialAmount,
                                              float monthlyContribution,
                                              int lengthInYears,
                                              float interestRate)
    //It is not recommended just to use letters of the alphabet when defining a method due to lack of description.
    //It is recommended to use the exact names for each variable of a function.
    {


        float nextYearAmountAccum = initialAmount; //accumulated monetary value per year
        float nextYearAmountInvest = initialAmount; //invested monetary value per year
        /*
        TODO: add your solution
         */
        int yearsAccum;
        for (yearsAccum = 1; yearsAccum <= lengthInYears; yearsAccum++)
        {
            nextYearAmountAccum = nextYearAmountAccum + monthlyContribution * 12 + (nextYearAmountAccum*(interestRate/100));
        }

        float actualAccum = nextYearAmountAccum;

        int yearsInvest;
        for (yearsInvest = 1; yearsInvest <= lengthInYears; yearsInvest++)
        {
            nextYearAmountInvest= nextYearAmountInvest + monthlyContribution *12;
        }

        float actualInvest = nextYearAmountInvest;

        if (initialAmount < 0.0f || monthlyContribution < 0.0f || lengthInYears < 0 || interestRate < -100f || interestRate > 100f) {
            actualInvest = 0;
            actualAccum = 0;
        }

        CompoundingResult result = new CompoundingResult(actualInvest, actualAccum); // which constructor does this call?




        return result;
    }
}
