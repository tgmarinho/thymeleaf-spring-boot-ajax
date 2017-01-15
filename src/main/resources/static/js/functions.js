function retrieveGuests() {
	var url = '/guests';
	
	if ($('#searchSurname').val() != '') {
		url = url + '/' + $('#searchSurname').val();
	}
	
	$("#resultsBlock").load(url);
}