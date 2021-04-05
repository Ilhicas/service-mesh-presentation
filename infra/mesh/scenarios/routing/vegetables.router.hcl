kind = "service-router"
name = "vegetables"
routes = [
  {
    match {
      http {
        path_prefix = "/vegetables"
      }
    }

    destination {
      service = "vegetables"
    }
  },
  {
    match {
      http {
        path_prefix = "/superheroes"
      }
    }

    destination {
      service = "superheroes"
    }
  },
]
