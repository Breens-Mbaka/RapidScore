<p align="center">
  <img src="/images/swiftscorelogo" width="40%"/>
</p>

# SwiftScore

A football stats and livescore app built with Kotlin,MVVM architecture,Retrofit, Coroutines and Navigation Components

## Demo

![5mfwtt](https://user-images.githubusercontent.com/72180010/132766680-472fb92a-e321-4058-8815-ed7f84d331c5.gif)

## Screenshots

  <p align="center">
<img src="/images/upcomingmatches.png" width="40%"/> 
<img src="/images/pastscores.png" width="40%"/> 
<img src="/images/leaguetable.png" width="40%"/>
<img src="/images/topscorers.png" width="40%"/>
</p>

## API Reference

#### Get upcoming matches

```https
  GET /api/v1/soccer/matches
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `apiKey` | `string` | **Required**. Your API key |
| `seasonId` | `string` | **Required**.League Id e.g Premier League|
| `dateFrom` | `string` | **Required**.|
| `dateTo` | `string` | **Required**.|

#### Get League Table

```https
  GET /api/v1/json/1/lookuptable.php
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `l`      | `string` | **Required**. League Id e.g 1980 for Premier League |
| `s`      | `string` | **Required**. League Season Id e.g 2021-2022 |

#### Get Top Scorers

```https
  GET /api/v1/soccer/topscorers
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `l`      | `string` | **Required**. League Id e.g 1980 for Premier League |
| `s`      | `string` | **Required**. League Season Id e.g 2021-2022 |

## Lessons Learned

- Software architecture makes it easier to scale, test and maintain an app. The way MVVM architectue principle is on separation of concerns which prevents tight coupling

- Perfomance heavy tasks like local database  and Networking operations should be done in the background thread to prevent blocking the main thread. This is where coroutines comes in to prevent memory leaks and increase app's responsive perfomance

- Recommended to use one activity and fragments that just swap in and out of the fragment container. Navigation components helped me to easily create navigation process in my app and how data can be transferred. Fragments are also lightweight than activities ans this improves app perfomance

- Learnt how to communicate to a remote data source and take the data and manipulate it to my fitting. Retrofit made this networking tasks very effecient with little work done on my side

## Roadmap

- Integrate offline caching functionality
- Add more leagues i.e La Liga, Ligue 1

## License

[MIT](https://choosealicense.com/licenses/mit/)
