```toml
name = 'Find Employee by ID'
method = 'GET'
url = 'http://localhost:8080/employees'
sortWeight = 3000000
id = '96679e20-4325-4591-bea6-16cc049ae6e2'

[body]
type = 'JSON'
raw = '''
{
  "id": 1,
  "empName": "Ahmed updated",
  "empEmail": "ahmed@gmail.com",
  "empSalary": 10000
}'''
```
