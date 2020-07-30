package opencart.Service.ServiceImpl;

import opencart.Model.Product;
import opencart.Model.WishList;
import opencart.Repository.WishListRepository;
import opencart.Service.ServiceInt.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class WishListServiceImpl implements WishListService {

    private final WishListRepository wishListRepository;

    @Autowired
    public WishListServiceImpl(WishListRepository wishListRepository) {
        this.wishListRepository = wishListRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Product> showProductByWishList() {
        return wishListRepository.findAllProductInWishList();
    }

    @Override
    @Transactional
    public Collection<Product> addProductToWishList(Integer productId, Integer customerID) {
        return wishListRepository.addProduct(productId, customerID);
    }

    @Override
    public WishList findWishListByID(Integer ID) {
        return wishListRepository.findWishListByID(ID);
    }

    @Override
    public Collection<Product> removeProductFromWishList(Product product) {
        return wishListRepository.removeProductInWishList(product);
    }

    //null
    @Override
    public Product findProductByID(Integer ID) {
        return wishListRepository.findProductByID(ID);
    }
}
