$(function(){
	$('.fa-bars').click(function(){
		$('.responsive-menu-bar').addClass('responsive-menu-active');
	});

	$('.fa-times').click(function(){
		$('.responsive-menu-bar').removeClass('responsive-menu-active');
	});


	/* this part is for image view gallery popup */
	$('.gallery-items > .gallery-item-box > a > img').click(function(){
		$('.imgBox').addClass('box_active');
	});

	$('.gallery_item_close').click(function(){
		$('.imgBox').removeClass('box_active');
	});
});

