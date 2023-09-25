# Import pandas
import pandas


data = {
  "Usernames": ["vai", "bhavu", "god"],
  "Passwords": ["password", "bhavu123", "god123"]
}

# Create a DataFrame using that data
emprecord = pandas.DataFrame(data)


print(emprecord)

emprecord.to_csv("employeewrite.csv", index=False)