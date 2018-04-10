package WarehouseExceptions;

import WarehouseElements.Item;
import WarehouseElements.Lot;

public class TooMuchWeightException extends Exception
{
	private String message;

	public TooMuchWeightException(Lot lot, Item item)
	{
		this.message = lot.toString() +  " has maximum capacity of " + lot.getSupportedWeight() +
						" kg. and current load of " + lot.getCurrentLoad() + " cannot store " +
						item.toString();
	}

	public String getMessage()
	{
		return message;
	}
}
