```toml
name = 'Create Employee'
method = 'POST'
url = 'http://localhost:8080/employees'
sortWeight = 1000000
id = 'beee1208-69ce-4d9e-834f-b78c97e660c3'

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
