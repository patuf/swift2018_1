import WarehouseElements.Item;
import WarehouseElements.Lot;
import WarehouseElements.Transaction;
import WarehouseElements.WarehouseExceptions.AlreadyExistsException;
import WarehouseElements.WarehouseExceptions.NotPresentException;

import java.util.List;

public class Warehouse
{
	private List<Lot> lots;
	private List<Item> items;
	private List<Transaction> transactions;

	public Warehouse(List<Lot> lots, List<Item> items, List<Transaction> transactions)
	{
		this.lots = lots;
		this.items = items;
		this.transactions = transactions;
	}

	public List<Lot> getLots()
	{
		return lots;
	}

	public List<Item> getItems()
	{
		return items;
	}

	public List<Transaction> getTransactions()
	{
		return transactions;
	}

	public boolean addLot(Lot lot) throws AlreadyExistsException
	{
		if (isExisting(lot))
			throw new AlreadyExistsException(lot);
		else
		{
			this.lots.add(lot);
			return true;
		}
	}

	public boolean addItem(Item item) throws AlreadyExistsException
	{
		if (isExisting(item))
			throw new AlreadyExistsException(item);
		else
		{
			this.items.add(item);
			return true;
		}
	}

	public boolean addTransaction(Transaction transaction) throws AlreadyExistsException
	{
		if (isExisting(transaction))
			throw new AlreadyExistsException(transaction);
		this.transactions.add(transaction);
		return true;
	}

	public boolean isExisting(Lot lot)
	{
		return lots.contains(lot);
	}

	public boolean isExisting(Item item)
	{
		return lots.contains(item);
	}

	public boolean isExisting(Transaction transaction)
	{
		return this.transactions.contains(transaction);
	}


	//may need to delete because obsolete
	public boolean removeItem(Item item) throws NotPresentException
	{
		if (isExisting(item))
		{
			items.remove(item);
			return true;
		}
		throw new NotPresentException(item);
	}

	public boolean removeLot(Lot lot) throws NotPresentException
	{
		if (isExisting(lot))
		{
			items.remove(lot);
			return true;
		}
		throw new NotPresentException(lot);
	}


}
