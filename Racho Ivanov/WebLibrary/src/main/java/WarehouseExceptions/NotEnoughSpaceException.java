package WarehouseExceptions;

import WarehouseElements.Item;
import WarehouseElements.Lot;

public class NotEnoughSpaceException extends Exception
{
	private String message;

	public NotEnoughSpaceException(Lot lot, Item item)
	{
		this.message = lot.toString() +  " has maximum capacity of " + lot.getSupportedVolume() +
						" liters and current free space is " + lot.getAvailableVolume() + " cannot store " +
						item.toString();
	}

	public String getMessage()
	{
		return this.message;
	}
}
