function eliminar(id){
	Swal.fire({
  title: '¿Estas seguro de eliminar?',
  text: "No se podran severtir los cambios",
  icon: 'warning',
  showCancelButton: true,
  confirmButtonColor: '#3085d6',
  cancelButtonColor: '#d33',
  confirmButtonText: 'Si, eliminar',
  cancelButtonText: 'Cancelar'
}).then((OK) => {
  if (OK.isConfirmed) {
		$.ajax({
			url:"/eliminar/"+id,
			success: function(res) {
				console.log(res);
			}
		});
    Swal.fire(
      'Eliminado',
      'El registro ha sido eliminado',
      'success'
    ).then((ok)=>{
	if(ok){
		location.href="/listar";
	}
	
});
  }
})
}