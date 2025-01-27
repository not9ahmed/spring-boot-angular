```toml
name = 'Updated Employee'
method = 'PUT'
url = 'http://localhost:8080/employees/1'
sortWeight = 4000000
id = 'bf145669-2f6c-4a6f-99c4-9faca9c7776b'

[body]
type = 'JSON'
raw = '''
{
  "empName": "Ahmed updated 2",
  "empEmail": "ahmed@gmail.com",
  "empSalary": 10000
}'''
```
