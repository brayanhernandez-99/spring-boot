// Call the dataTables jQuery plugin
$(document).ready(function() {
    uploadUsers();
    $('#dataTable-users').DataTable();
});

async function uploadUsers() {
    const request = await fetch('http://localhost:8080/users', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const response = await request.json();
    let dataTableUser = '';
    for (let user of response){
        dataTableUser += '<tr><td>' + user.id + '</td><td>' + user.name + '</td><td>' + user.last_name + '</td><td>' + user.email + '</td><td>' + user.phone + '</td><td>' + user.age + '</td><td><div class="d-flex justify-content-around"><a href="#" class="btn btn-info btn-circle btn-sm"><i class="fa fa-user"></i></a><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fa fa-trash"></i></a></div></td></tr>'
    }
    document.querySelector('#dataTable-users tbody').outerHTML = dataTableUser;
}
