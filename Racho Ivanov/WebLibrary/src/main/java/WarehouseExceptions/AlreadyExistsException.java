package WarehouseExceptions;

import WarehouseElements.Item;
import WarehouseElements.Lot;
import WarehouseElements.Transaction;

public class AlreadyExistsException extends Exception
{
	private String message = "already exists!";

	public AlreadyExistsException(Item item)
	{
		this.message = item.toString() + this.message;
	}

	public AlreadyExistsException(Lot lot)
	{
		this.message = lot.toString() + this.message;
	}

	public AlreadyExistsException(Transaction transaction)
	{
		this.message = transaction.toString() + this.message;
	}

	public String getMessage()
	{
		return message;
	}
}
