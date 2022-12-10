package com.Ecommerce.Lawn.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.mysql.cj.jdbc.Driver;

public class FileUtilities {
	public static Connection con;
	/**
	 * It is used to read the data from the propertyFile
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String  getPropertyData(String key ) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(AutoConstants.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
	}
	/**
	 * It is used to Read data from Excelsheet
	 * @param Sheetname
	 * @param Row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
		public String getExcelData(String Sheetname,int Row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis= new FileInputStream(AutoConstants.excelPath);
			Workbook wb=WorkbookFactory.create(fis) ;
		String cellData =wb.getSheet(Sheetname).getRow(Row).getCell(cell).getStringCellValue();
			return cellData;
		}
		/**
		 * It is used to read data from Database
		 * @return
		 * @throws SQLException
		 */
		public Connection getDatabaseData() throws SQLException {
			Driver dref=new Driver();
			DriverManager.registerDriver(dref);
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","parimalanayak29@", "parimalanayak29@");
			return con;
			}
		/**
		 * It is used to Execute the query
		 * @param query
		 * @param columnName
		 * @param ExpectedResults
		 * @return
		 * @throws SQLException
		 */
		public String queryExecution(String query,int columnName,String ExpectedResults) throws SQLException {
			Statement statement =con.createStatement();
			ResultSet result = statement.executeQuery(query);
			while(result.next()) {
				if(result.getString(columnName).equals(ExpectedResults)) {
					break;
				}else {
					System.out.println("data not found");
				}
			}
		return ExpectedResults;
		}
		/**
		 * to close the database connection
		 * @throws SQLException
		 */
		public void closeDB() throws SQLException {
			con.close();
		}
}
		
	


