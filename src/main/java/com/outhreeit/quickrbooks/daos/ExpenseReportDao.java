package com.outhreeit.quickrbooks.daos;

import com.outhreeit.quickrbooks.entities.ExpenseReport;
import org.springframework.stereotype.Repository;

/**
 * Created by ddelaney on 12/4/2015.
 */
@Repository
public class ExpenseReportDao extends BaseDao<ExpenseReport> implements IExpenseReportDao {
    public ExpenseReportDao() {
        super("expensereport", ExpenseReport.class);
    }
}
