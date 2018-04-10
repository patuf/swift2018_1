package WarehouseExceptions;

import WarehouseElements.Item;
import WarehouseElements.Lot;

public class NotPresentException extends Exception
{
	private String message;

	public NotPresentException(Item item)
	{
		this.message = item.toString() + " does not exist";
	}

	public NotPresentException(Lot lot)
	{
		this.message = lot.toString() + " does not exist";
	}

	@Override
	public String getMessage()
	{
		return message;
	}
}
