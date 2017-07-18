const commando = require('discord.js-commando');
const MovieDB = require('moviedb')('324938bccc324fb58e236a92cb0a9bc3');
const Movie_Searcher_Main = require('../../commands/movie_searcher/movie_searcher_main');


class MovieSearcherCommand extends commando.Command{

    constructor(client){
        super(client, {
            name: 'getmovie',
            group: 'movie_searcher',
            memberName: 'getmovie',
            description: 'Getting Movie Information',
            args: [
                    {
                      key: 'moviename',
                      prompt: 'Please enter the name of the movie\n',
                      type: 'string'
                      
                    }
		    	  ]
        });
    }

    async run(message, {moviename}){

        const search_movie = new Movie_Searcher_Main();
        return search_movie.displayResult(moviename,(a)=>message.reply(a));
      
    }
}

module.exports = MovieSearcherCommand;