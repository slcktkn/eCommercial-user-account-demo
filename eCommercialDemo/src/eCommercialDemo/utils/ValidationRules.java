package eCommercialDemo.utils;

public class ValidationRules {
	
	public static boolean validate(boolean... logics)
	{
	for (boolean logic : logics)
    {
        if (!logic)
        {
            return false;
        }
    }
		return true;

}

}
