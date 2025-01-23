```toml
name = 'Register Admin'
method = 'POST'
url = 'http://localhost:8080/api/auth/register'
sortWeight = 500000
id = '89f6fe9c-14fb-456b-81e2-16914a12bbe2'

[body]
type = 'JSON'
raw = '''
{
  username: "admin",
  password: "admin",
  firstName: "admin",
  lastName: "admin",
  role: "ADMIN"
}'''
```
