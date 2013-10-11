$(document).ready(function(){

	// Validate
	// http://bassistance.de/jquery-plugins/jquery-plugin-validation/
	// http://docs.jquery.com/Plugins/Validation/
	// http://docs.jquery.com/Plugins/Validation/validate#toptions

		$('#subscribe-form').validate({
		lang: 'es',
	    rules: {
	    	email: {
	    		required: true,
	    		email: true
	    	},
	    	username: {
	    		required: true
	    	}
	    }
	  });

}); // end document.ready