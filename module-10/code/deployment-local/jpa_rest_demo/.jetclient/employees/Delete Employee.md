```toml
name = 'Delete Employee'
method = 'DELETE'
url = 'http://localhost:8080/employees/4'
sortWeight = 5000000
id = 'e56967e5-7d16-4ec0-89d1-3627e8e1e576'

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
