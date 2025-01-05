```toml
name = 'Create User'
method = 'POST'
url = 'http://localhost:8080/users'
sortWeight = 2000000
id = 'ce135aad-30f3-4c3e-8947-c917cf0b3294'

[body]
type = 'JSON'
raw = '''
{
  "id": 1,
  "name": "Joe",
  "email": "joe@gmail.com"
}'''
```
