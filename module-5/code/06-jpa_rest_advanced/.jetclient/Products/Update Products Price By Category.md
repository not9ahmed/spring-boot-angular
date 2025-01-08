```toml
name = 'Update Products Price By Category'
method = 'PATCH'
url = 'http://localhost:8080/products/updatePrice?price=9999&category=PC'
sortWeight = 9000000
id = 'ae3062ef-6a0b-4112-839e-7b39939925ea'

[[queryParams]]
key = 'price'
value = '9999'

[[queryParams]]
key = 'category'
value = 'PC'

[body]
type = 'JSON'
```
