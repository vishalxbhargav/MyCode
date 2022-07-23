const API_URL = 'https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=a5ff600e9cda2e8deab07ddce42e0c4c&page=1'

const IMG_PATH = 'https://image.tmdb.org/t/p/w500/'
const SEARCH_URL ='https://api.themoviedb.org/3/search/movie?api_key=a5ff600e9cda2e8deab07ddce42e0c4c&query="'

const form = document.getElementById("form")


//get Initial Movies
getMovies(API_URL)
async function getMovies(url){
    const res = await fetch(url)
    const data = await res.json()

    showMovies(data.results)
}

function showMovies(movies) {
    Main.innerHTML = ''

    movies.forEach((movie) =>{
        const {title, poster_path, vote_average,overview} = movie
        
        const movieEl = document.createElement('div')
        movieEl.classList.add('movie')

        movieEl.innerHTML ='
        <div class ="movie">
            <img src"${ IMG_PATH + Poster }" alt="${title}">
        </div>
        '

    })
}

form.addEventListener('submit',(e) =>{
    e.preventDefault()

    if(searchTerm && searchTerm !==''){
        getMovies(SEARCH_API + searchTerm)

        search.value = ''
    }else{
        window.location.reload()
    }
})