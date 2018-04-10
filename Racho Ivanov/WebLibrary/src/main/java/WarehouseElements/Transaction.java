package WarehouseElements;

import java.time.LocalDateTime;

public class Transaction
{
	private final Lot lot;
	private final Item item;
	private final int itemQuantity;
	private final LocalDateTime dateTime;
	private final boolean transactionType;

	public Transaction(int id, Lot lot, Item item, int itemQuantity,  boolean transactionType)
	{
		this.lot = lot;
		this.item = item;
		this.itemQuantity = itemQuantity;
		this.dateTime = LocalDateTime.now();
		this.transactionType = transactionType;
	}

	public Lot getLot()
	{
		return lot;
	}

	public Item getItem()
	{
		return item;
	}

	public LocalDateTime getDateTime()
	{
		return dateTime;
	}

	public boolean isTransactionType()
	{
		return transactionType;
	}

	public String TransactionType()
	{
		if (this.transactionType)
			return "import";
		return "export";
	}
}